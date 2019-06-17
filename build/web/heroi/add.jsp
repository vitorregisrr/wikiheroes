<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@include file="../admin/cabecalho.jsp" %>
<main>
        <section id="actions" style="padding-top: 150px; min-height: 80vh">
            <h3 class="inner-title mb-3">Novo Herói</h3>
            <div class="container">
                <div class="row">
                    <div class="offset-md-3"></div>
                    <div class="col-md-6">
                        <form action="HeroiWS" method="POST">
                            <div class="row">
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
                                    <input type="text" name="txtPoder" class="form-control" placeholder="Poder">
                                </div>
                                <div class="form-group">
                                    <input type="text" name="txtFraqueza" class="form-control" placeholder="Fraqueza">
                                </div>
                                <div class="form-group">
                                    <select type="text" name="txtLiga" class="form-control select-picker" placeholder="Liga">
                                        <c:forEach items="${ligas}" var="liga">
                                        <option value="${liga.id}">${liga.nome}</option>
                                        </c:forEach>
                                    </select>
                                </div>
                                <button type="submit" class="btn-main--outline w-100">Criar</button>
                            </div>
                        </form>
                    </div>
                    <div class="offset-md-3"></div>
                </div>
        </section>
    </main>
<script>
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