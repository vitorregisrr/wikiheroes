<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@include file="../principal/cabecalhousu.jsp" %>
<section id="last-heroes" class="img-webp">
            <div class="centered"> 
                <div class=""></div>
                <div class="heroes-slider wow fadeInUp" data-wow-delay="0.6s">
                    <div class="owl-carousel owl-theme">
                    <c:forEach items="${herois}" var="heroi">
                        <div class="item">
                            <div class="heroi">
                                <div class="heroi__img">
                                    <a href=""><img src="../images/loading.gif" data-src="${heroi.url}" class="lazy" alt=""></a>
                                </div>
                                <div class="heroi__content">
                                    <h4 class="heroi__title">${heroi.nome}</h4>
                                    <p class="heroi__desc">${heroi.poder}
                                    </p>
                                </div>
                            </div>
                        </div>
                    </c:forEach>
                    </div>
                </div>  
            </div>
        </section>
<%@include file="../principal/rodape.jsp" %>