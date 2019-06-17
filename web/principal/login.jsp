<%@include file="../principal/cabecalhousu.jsp" %>
<main>
        <section id="login" style="padding-top: 200px; min-height: 80vh">
            <h3 class="inner-title mb-3">Login</h3>
            <div class="container">
                <div class="row">
                    <div class="offset-md-4"></div>
                    <div class="col-md-4">
                        <form action="LogarWS" method="POST">
                            <div class="form-group">
                                <input type="text" class="form-control" name="txtEmail" type="text" placeholder="Email">
                            </div>
                            <div class="form-group">
                                <input type="password" class="form-control" name="txtSenha" type="text" placeholder="Senha">
                            </div>
                            <button class="btn-main--outline w-100">Entrar</button>
                        </form>
                        <br/>
                        <h3 style="text-align: center;">${sessionScope['erro']}</h3>
                    </div>
                    <div class="offset-md-4"></div>
                </div>
            </div>
        </section>
</main>
<%@include file="../principal/rodape.jsp" %>
