var gulp = require('gulp'),
    sass = require('gulp-sass'),
    imagemin = require('gulp-imagemin'),
    webp = require('gulp-webp'),
    cssmin = require('gulp-cssmin'),
    rename = require('gulp-rename'),
    gzip = require('gulp-gzip'),
    concat = require('gulp-concat'),
    uglify = require('gulp-uglify-es').default;


const mincss = () => {
    gulp.src('./css/main.css')
        .pipe(cssmin())
        .pipe(rename({
            suffix: '.min'
        }))
        .pipe(gulp.dest('./css/'));
}

gulp.task('sass', async () => {
    gulp.src('./scss/main.scss')
        .pipe(sass())
        .pipe(gulp.dest('./css/')),
        mincss();
});

gulp.task('listensass', async () => {
    gulp.watch('./scss/**/*.scss', gulp.series('sass'))
});

gulp.task('mincss', async () => {
    mincss();
})

gulp.task('gzipcss', async () => {
    gulp.src('./css/main.css')
        .pipe(gzip())
        .pipe(gulp.dest('./css/'));
})

gulp.task('jsmin', async () => {
    gulp.src('./js/**/*.js')
        .pipe(concat('main.js'))
        .pipe(uglify())
        .pipe(rename({
            suffix: '.min'
        }))
        .pipe(gulp.dest('./js'));
})

gulp.task('gzipjs', async () => {
    gulp.src('./js/main.js')
        .pipe(gzip())
        .pipe(gulp.dest('./js/'));
})

gulp.task('imagesmin', async () => {
    gulp.src('images/**/*')
        .pipe(imagemin())
        .pipe(gulp.dest('images'));
});

gulp.task('towebp', async () => {
    gulp.src('images/**/*')
        .pipe(webp())
        .pipe(gulp.dest('images'))
});