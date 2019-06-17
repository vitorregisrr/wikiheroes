<%@include file="cabecalho.jsp" %>
<main>
        <section id="actions" style="padding-top: 150px; min-height: 80vh">
            <div class="container">
                <div class="d-flex justify-content-end">
                    <a role="button" href="novocliente.jsp" class="btn-main--outline">Novo</a>
                </div>
                <h3 class="inner-title mb-3">Listar Clientes</h3>
                <div class="form-group search">
                    <form method="GET" action="ClienteWS">
                        <input type="text" class="form-control search mb-3" placeholder="Pesquisar Cliente..." name="txtFiltro"/>
                    </form>
                </div>
                <div class="row">
                    <table class="table">
                        <thead>
                            <th>Nome</th>
                            <th>Endereço</th>
                            <th>Telefone</th>
                            <th></th>
                        </thead>
                        <tbody>
                            <c:forEach items="${clientes}" var="c">
                                <tr>
                                    <td>${c.nome}</td>
                                    <td>${c.endereco}</td>
                                    <td>${c.telefone}</td>
                                    <td><a role="button" class="btn btn-sm btn-secondary" href="ClienteWS?txtAcao=ver&txtId=${c.id}">Ver</a> 
                                        <a role="button" class="btn btn-sm btn-danger" href="ClienteWS?txtAcao=del&txtId=${c.id}">Apagar</a></td>
                                </tr>
                            </c:forEach>
                        </tbody>
                    </table>
                                            <h3 style="text-align: center; color: red;">${erro}</h3>

                </div>
        </section>
    </main>
<%@include file="../principal/rodape.jsp" %>