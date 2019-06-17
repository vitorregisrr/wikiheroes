<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@include file="../principal/cabecalhousu.jsp" %>
<main>
        <section id="actions" style="padding-top: 150px; min-height: 80vh">
            <h3 class="inner-title mb-3">Listar Ligas</h3>
            <div class="container">
                <div class="row">
                    <c:forEach items="${lista}" var="obj">
                    <div class="col-md-4 col-lg-3">
                        <div class="heroi mb-3">
                            <div class="heroi__img">
                                <a href=""><img src="../images/loading.gif" data-src="${obj.url}" class="lazy" alt=""></a>
                            </div>
                            <div class="heroi__content">
                                <h4 class="heroi__title">${obj.nome}</h4>
                                <p class="heroi__desc">
                                </p>
                            </div>
                        </div>
                    </div>
                    </c:forEach>
                </div>
            </div>
        </section>
    </main>
<%@include file="../principal/rodape.jsp" %>