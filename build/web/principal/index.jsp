<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@include file="../principal/cabecalhousu.jsp" %>
<main>

    <div id="heroi"></div>
    <section id="last-heroes" class="img-webp">
        <div class="centered">
            <div class="container">
                <div class="form-group search">
                    <form method="GET" action="GibisUsuWS?txtAcao=heroi">
                        <input type="text" class="form-control search mb-3" placeholder="Pesquisar Herói..." name="txtFiltro"/>
                    </form>
                </div>
            </div>
            <div class="heroes-slider wow fadeInUp" data-wow-delay="0.6s">
                <div class="owl-carousel owl-theme mt-5">
                    <c:forEach items="${herois}" var="heroi">
                        <div class="item">
                            <div class="heroi">
                                <div class="heroi__img">
                                    <img src="../images/loading.gif" data-src="${heroi.url}" class="lazy" alt="">
                                </div>
                                <div class="heroi__content">
                                    <h4 class="heroi__title text-center">${heroi.nome}</h4>
                                    <p class="heroi__desc text-center">${heroi.poder}
                                    </p>
                                    <div class="heroi__link text-center">
                                        <a>Ler mais >></a>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </c:forEach>
                </div>
            </div>
            <div class="view-more container wow fadeInUp">
                <a role="button" class="btn-main--outline" href="../principal/GibisUsuWS?txtAcao=heroi">Ver Todos</a>
            </div>
        </div>
    </section>
    <section id="ligas">
        <div class="container">

            <div class="row">
                <div class="col-lg-4 ligas__desc text-center text-lg-left wow fadeInUp">
                    <h3 class="title mb-2">
                        Ligas
                    </h3>
                    <p class="inner-desc text-left w-100"> As ligas que já foram cadastradas no sistema </p>
                    <h4 class="sub-title mb-3"></h4>
                    <div class="ligas__arrows">
                    </div>
                </div>
                <div class="col-lg-8 d-flex justify-content-center align-items-center pr-0">
                    <div class="ligas-slider img-webp wow fadeInRight">
                        <div class="owl-carousel owl-theme">
                            <c:forEach items="${ligas}" var="liga">
                                <div class="item">
                                    <div class="ligas-slider__item">
                                          <img src="../images/loading.gif" data-src="${liga.url}" class="lazy" alt="" style="height: 200px; width: 200px; object-fit: contain" />
                                          <p class="liga__name mb-1">${liga.nome}</p>
                                        <p class="liga__text pt-0">${liga.descricao}</p>
                                    </div>
                                </div>
                            </c:forEach>
                        </div>
                    </div>
                </div>
                <div class="view-more container wow fadeInUp mt-0 pt-0">
                    <a role="button" class="btn-main--outline" href="../principal/GibisUsuWS?txtAcao=liga">Ver Todas</a>
                </div>
            </div>

        </div>
    </section>
</main>
<%@include file="../principal/rodape.jsp" %>