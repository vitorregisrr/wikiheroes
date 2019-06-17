<%@include file="../admin/cabecalho.jsp" %>
<main>
    <section id="actions" style="padding-top: 150px; min-height: 80vh">
        <h3 class="inner-title mb-3">Nova Liga</h3>
        <div class="container">
            <div class="row">
                <div class="offset-md-3"></div>
                <div class="col-md-6">
                    <form action="LigaWS" method="POST">
                        <div class="row">
                            <div class="form-group">
                                <input type="text" name="txtId" class="form-control" placeholder="Id" value="${liga.id}" readonly/>
                            </div>
                            <div class="form-group">
                                <input type="text" name="txtNome" class="form-control" placeholder="Nome" value="${liga.nome}"/>
                            </div>
                            <div class="form-group">
                                <input type="text" name="txtUrl" class="form-control" id="urlInput" placeholder="URL da imagem" value="${liga.url}"/>
                                  <div class="img-preview">
                                        <p id="preview-error" class="error">URL inválido.</p>
                                        <img  id="img-preview" src="" alt="" class="input-preview">
                                    </div>
                            </div>
                            <div class="form-group">
                                <input type="text" name="txtDesc" class="form-control" placeholder="Descrição" value="${liga.descricao}"/>
                            </div>

                            <button type="submit" class="btn-main--outline w-100">Editar</button>
                        </div>
                    </form>
                </div>
                <div class="offset-md-3"></div>
            </div>
    </section>
</main>
<script>
    document.addEventListener('DOMContentLoaded', function () {
        $('#urlInput').keyup(function () {
            if ($(this).val().match(/[-a-zA-Z0-9@:%_\+.~#?&//=]{2,256}\.[a-z]{2,4}\b(\/[-a-zA-Z0-9@:%_\+.~#?&//=]*)?/gi)) {
                $('#img-preview').show();
                $('#img-preview').attr('src', $(this).val());
                $('#preview-error').hide();

            } else {
                $('#img-preview').hide();
                $('#preview-error').show();
            }
        });
    });
</script>
<%@include file="../principal/rodape.jsp" %>