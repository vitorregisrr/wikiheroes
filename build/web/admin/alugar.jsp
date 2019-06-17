<%@include file="cabecalho.jsp" %>
<main>
        <section id="actions" style="padding-top: 150px; min-height: 80vh">
                <div class="container">
                <div class="d-flex justify-content-end">
                    <a role="button" href="GibiWS?txtAcao=add" class="btn-main--outline">Novo</a>
                </div>
                <h3 class="inner-title mb-3">Listar Gibis</h3>
                <div class="row">
                    <c:forEach items="${gibis}" var="g">
                        <div class="col-md-4 col-lg-3">
                            <div class="heroi mb-3">
                                <div class="heroi__img">
                                    <a href=""><img data-src="${g.url}" class="lazy" alt=""></a>
                                </div>
                                <div class="heroi__content">
                                    <h4 class="heroi__title">${g.nome}</h4>
                                    <div class="heroi__link">
                                        <a href="GibiWS?txtAcao=alugar&txtId=${g.id}&txtCliente=${c}">Alugar >></a>
                                        <br />
                                        <a href="GibiWS?txtAcao=ver&txtId=${g.id}">Ver >></a>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </c:forEach>
                </div>
        </section>
    </main>
<%@include file="../principal/rodape.jsp" %>