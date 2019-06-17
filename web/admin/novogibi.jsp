<%@include file="cabecalho.jsp" %>
<main>
        <section id="actions" style="padding-top: 150px; min-height: 80vh">
            <h3 class="inner-title mb-3">Novo Gibi</h3>
            <div class="container">
                <div class="row">
                    <div class="offset-md-3"></div>
                    <div class="col-md-6">
                        <form action="GibiWS" method="POST">
                            <div id="formWrapper" class="row">
                                <div class="form-group">
                                    <input type="text" name="txtNome" class="form-control" placeholder="Nome">
                                </div>
                                <div class="form-group">
                                    <input id="urlInput" type="text" name="txtUrl" class="form-control" placeholder="URL da Imagem">

                                    <div class="img-preview">
                                        <p id="preview-error" class="error">URL inválido.</p>
                                        <img  id="img-preview" src="" alt="" class="input-preview">
                                    </div>
                                </div>
                                <div class="form-group">
                                    <input type="number" name="txtSerie" class="form-control" placeholder="N. série">
                                </div>
                                <div class="form-group">
                                    <select name="txtLiga" class="form-control">
                                        <option value="">Liga Relacionada</option>
                                        <c:forEach items="${ligas}" var="l">
                                            <option value="${l.id}">${l.nome}</option>
                                        </c:forEach>
                                    </select>
                                </div>
                                <div class="form-group">
                                    <select name="heroies" id="" class="form-control">
                                        <option value="">Herói relacionado</option>
                                        <c:forEach items="${herois}" var="h">
                                            <option value="${h.id}">${h.nome}</option>
                                        </c:forEach>
                                    </select>
                                </div>
                            </div>
                                    <div class="d-flex justify-content-end mb-4">
                                        <button type="button"  id="btnAddHeroi" class="btn p-3 btn-main float-right">
                                            +
                                        </button>
                                    </div>
                            <button type="submit" class="btn-main--outline w-100">Criar</button>
                        </form>
                    </div>
                    <div class="offset-md-3"></div>
                </div>
        </section>
    </main>
<script>
    document.addEventListener('DOMContentLoaded', function () {
        $('#btnAddHeroi').click(function () {
            $('#formWrapper').append(
                `<div class="form-group">
                        <select class="form-control" name="heroies" id="">
                            <option value="">Herói relacionado</option>
                            <c:forEach items="${herois}" var="h">
                                            <option value="${h.id}">${h.nome}</option>
                            </c:forEach>
                        </select>
                </div>`)
        });
    });
    document.addEventListener('DOMContentLoaded', function() {
        $('#urlInput').keyup( function() {
            if( $(this).val().match(/[-a-zA-Z0-9@:%_\+.~#?&//=]{2,256}\.[a-z]{2,4}\b(\/[-a-zA-Z0-9@:%_\+.~#?&//=]*)?/gi) ){
                $('#img-preview').show();
                $('#img-preview').attr('src', $(this).val());
                $('#preview-error').hide();

            } else{
                $('#img-preview').hide();
                $('#preview-error').show();
            }
        });
    });
</script>
<%@include file="../principal/rodape.jsp" %>