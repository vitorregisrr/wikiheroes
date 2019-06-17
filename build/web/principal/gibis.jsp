<%@include file="cabecalhousu.jsp" %>
<main>
        <section id="actions" style="padding-top: 150px; min-height: 80vh">
                <div class="container">
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
                                        <a href="GibisUsuWS?txtAcao=ver&txtId=${g.id}">Ver >></a>
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