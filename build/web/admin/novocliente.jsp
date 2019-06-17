<%@include file="cabecalho.jsp" %>
<main>
        <section id="actions" style="padding-top: 150px; min-height: 80vh">
            <h3 class="inner-title mb-3">Novo Cliente</h3>
            <div class="container">
                <div class="row">
                    <div class="offset-md-3"></div>
                    <div class="col-md-6">
                        <form action="ClienteWS" method="POST">
                            <div class="row">
                                <div class="form-group">
                                    <input type="text" name="txtNome" class="form-control" placeholder="Nome">
                                </div>
                                <div class="form-group">
                                    <input type="text" name="txtCpf" class="form-control" placeholder="CPF" maxlength="11">
                                </div>
                                <div class="form-group">
                                    <input type="text" name="txtEndereco" class="form-control" placeholder="Endereço">
                                </div>
                                <div class="form-group">
                                        <input type="text" name="txtTelefone" class="form-control" placeholder="Telefone" data-mask="(00) 00000-0000" data-mask-selectonfocus="true">
                                    </div>
                                <button type="submit" class="btn-main--outline w-100">Registrar</button>
                            </div>
                        </form>
                    </div>
                    <div class="offset-md-3"></div>
                </div>
        </section>
    </main> 

<%@include file="../principal/rodape.jsp" %>