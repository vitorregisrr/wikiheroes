<%@include file="cabecalho.jsp" %>
<main>
        <section id="login" style="padding-top: 200px; min-height: 80vh">
            <h3 class="inner-title mb-3">Novo Moderador</h3>
            <div class="container">
                <div class="row">
                    <div class="offset-md-4"></div>
                    <div class="col-md-4">
                        <form action="AdministradorWS" method="POST">
                            <div class="form-group">
                                <input class="form-control" name="txtNome" type="text" placeholder="Usuário">
                            </div>
                            <div class="form-group">
                                <input class="form-control" name="txtEmail" type="email" placeholder="Email">
                            </div>
                            <div class="form-group">
                                <input class="form-control" name="txtSenha" type="password" placeholder="Senha" required>
                            </div>
                            <button type="submit" class="btn-main--outline w-100">Registrar</button>
                        </form>
                    </div>
                    <div class="offset-md-4"></div>
                </div>
            </div>
        </section>
    </main>
<%@include file="../principal/rodape.jsp" %>