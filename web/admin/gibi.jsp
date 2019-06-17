<%@include file="cabecalho.jsp" %>
<main>
        <section id="actions" style="padding-top: 150px; min-height: 80vh">
            <div class="container">
                <div class="row">
                    <div class="offset-md-3"></div>
                    <div class="col-md-6 d-flex justify-content-center flex-column">
                        <div class="d-flex justify-content-end">
                            <a role="button" href="GibiWS?txtAcao=edit&txtId=${gibi.id}" class="btn-main p-3">Editar</a>
                        </div>
                        <div class="heroi">
                            <div class="heroi__img">
                                <img data-src="${gibi.url}" class="lazy" alt="">
                            </div>
                            <div class="heroi__content">
                                <h4 class="heroi__title">${gibi.nome}</h4>
                                    <c:if test="${gibi.ocupado != null}">
                                        <a href="GibiWS?txtAcao=desalugar&txtId=${gibi.id}">
                                                <div class="card p-2 color-navy">Status: Ocupado por ${gibi.ocupado.nome} (Clique para Devolver)</div>
                                        </a>
                                    </c:if>
                                    <c:if test="${gibi.ocupado == null}">
                                        <a href="#">
                                                <div class="card p-2 color-navy">Status: Gibi Livre</div>
                                        </a>
                                    </c:if>
                                <div class="heroi__link">
                                </div>
                            </div>
                        </div>
                        <h4 class="inner-title mt-2 mb-4">Heróis relacionados</h4>
                        <div class="row">
                            <table class="table">
                                <thead>
                                    <th>Nome</th>
                                    <th>Descrição</th>
                                </thead>
                                <tbody>
                                    <c:forEach items="${gibi.herois}" var="h">
                                        <tr>
                                            <td>${h.nome}</td>
                                            <td>${h.poder}</td>
                                        </tr>
                                    </c:forEach>
                                </tbody>
                            </table>
                        </div>
                    </div>
                    <div class="offset-md-3"></div>
                </div>
        </section>
    </main>
<%@include file="../principal/rodape.jsp" %>