<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@include file="../admin/cabecalho.jsp" %>
<main>
    <section id="actions" style="padding-top: 150px; min-height: 80vh">
        <div class="container">
            <div class="d-flex justify-content-end">
                <a role="button" href="../heroi/HeroiWS?txtAcao=add" class="btn-main--outline">Novo</a>
            </div>
            <h3 class="inner-title mb-3">Listar Heróis</h3>
            <div class="form-group search">
                <form method="GET" action="HeroiWS">
                    <input type="text" class="form-control search mb-3" placeholder="Pesquisar Herói..." name="txtFiltro"/>
                </form>
            </div>
            <div class="row">
                <c:forEach items="${herois}" var="heroi">
                    <div class="col-md-4 col-lg-3">
                        <div class="heroi mb-3">
                            <div class="heroi__img">
                                <a href=""><img src="../images/loading.gif" data-src="${heroi.url}" class="lazy" alt=""></a>
                            </div>
                            <div class="heroi__content">
                                <h4 class="heroi__title">${heroi.nome}</h4>
                                <p class="heroi__desc">${heroi.poder}
                                </p>
                                <div class="heroi__link">
                                    <a href="HeroiWS?txtAcao=edit&txtId=${heroi.id}">Editar >></a>
                                    <br />
                                    <a href="HeroiWS?txtAcao=del&txtId=${heroi.id}">Delete >></a>
                                </div>
                            </div>
                        </div>
                    </div>
                </c:forEach>
            </div>
    </section>
</main>
<%@include file="../principal/rodape.jsp" %>