<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@include file="../admin/cabecalho.jsp" %>
<main>
        <section id="actions" style="padding-top: 150px; min-height: 80vh">
            
            <div class="container">
                <div class="d-flex justify-content-end">
                    <a role="button" href="../liga/LigaWS?txtAcao=add" class="btn-main--outline">Novo</a>
                </div>
                <h3 class="inner-title mb-3">Listar Ligas</h3>
                <div class="form-group search">
                    <form method="GET" action="LigaWS">
                        <input type="text" class="form-control search mb-3" placeholder="Pesquisar Liga..." name="txtFiltro"/>
                    </form>
                </div>
                <div class="row">
                    <c:forEach items="${lista}" var="obj">
                    <div class="col-md-4 col-lg-3">
                        <div class="heroi mb-3">
                            <div class="heroi__img">
                                <a href=""><img src="../images/loading.gif" data-src="${obj.url}" class="lazy" alt=""></a>
                            </div>
                            <div class="heroi__content">
                                <h4 class="heroi__title">${obj.nome}</h4>
                                <p class="heroi__desc">
                                </p>
                                <div class="heroi__link">
                                    <a href="LigaWS?txtAcao=edit&txtId=${obj.id}">Editar >></a>
                                    <br />
                                    <a href="LigaWS?txtAcao=del&txtId=${obj.id}">Deletar >></a>
                                </div>
                            </div>
                        </div>
                    </div>
                    </c:forEach>
                </div>
            </div>
        </section>
    </main>
<%@include file="../principal/rodape.jsp" %>