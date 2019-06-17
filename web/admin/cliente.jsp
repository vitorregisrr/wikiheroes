<%@include file="cabecalho.jsp" %>
    <main>
            <section id="actions" style="padding-top: 150px; min-height: 80vh">
                <div class="container">
                    <div class="row">
                        <div class="offset-md-3"></div>
                        <div class="col-md-6 d-flex justify-content-center flex-column">
                            <h4 class="inner-title mt-2 mb-4">${c.nome}</h4>
                            <div class="d-flex justify-content-end">
                                <a role="button" href="ClienteWS?txtAcao=edit&txtId=${c.id}" class="btn-main p-3">Editar</a>
                            </div>
                            <br/>
                            <div class="row">
                                <table class="table">
                                    <tbody>
                                        <tr>
                                            <td>Nome</td>
                                            <td>${c.nome}</td>
                                        </tr>

                                        <tr>
                                            <td>CPF</td>
                                            <td>${c.cpf}</td>
                                        </tr>

                                        <tr>
                                            <td>Telefone</td>
                                            <td>${c.telefone}</td>
                                        </tr>

                                        <tr>
                                            <td>Endereço</td>
                                            <td>${c.endereco}</td>
                                        </tr>
                                    </tbody>
                                </table>
                            </div>
                            <c:if test="${c.gibi == null}">
                                <div class="d-flex justify-content-center">
                                    <a role="button" href="GibiWS?txtAcao=listaluga&txtCliente=${c.id}" class="btn-main p-3">Alugar Gibi</a>
                                </div>
                            </c:if>
                            <c:if test="${c.gibi != null}">
                                <div class="d-flex justify-content-center">
                                    <a role="button" href="#" class="btn-danger p-3">Alugado</a>
                                </div>
                            </c:if>
                        </div>
                        <div class="offset-md-3"></div>
                    </div>
            </section>
    </main>
<%@include file="../principal/rodape.jsp" %>