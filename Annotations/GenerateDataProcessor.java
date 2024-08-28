package Annotations;

// Creating an annotation with the name @generateData so that if I use it on any class, It will automatically generate getters and setters for that class

// import java.lang.annotation.ElementType;
// import java.lang.annotation.Retention;
// import java.lang.annotation.RetentionPolicy;
// import java.lang.annotation.Target;

// @Target annotation is used to specify the types of elements on which an annotation can be applied.
// @Retention annotation is used to specify how the marked annotation is stored.
// @Retention(RetentionPolicy.RUNTIME) means that the annotation will be available to the JVM through runtime.

// import com.squareup.javapoet.JavaFile;
// import com.squareup.javapoet.MethodSpec;
// import com.squareup.javapoet.TypeSpec;

// import javax.annotation.processing.AbstractProcessor;
// import javax.annotation.processing.Processor;
// import javax.annotation.processing.RoundEnvironment;
// import javax.annotation.processing.SupportedAnnotationTypes;
// import javax.annotation.processing.SupportedSourceVersion;
// import javax.lang.model.SourceVersion;
// import javax.lang.model.element.Element;
// import javax.lang.model.element.Modifier;
// import javax.lang.model.element.TypeElement;
// import javax.tools.Diagnostic;
// import java.io.IOException;
// import java.util.Set;

// @SupportedAnnotationTypes("GenerateData")
// @SupportedSourceVersion(SourceVersion.RELEASE_8)
// public class GenerateDataProcessor extends AbstractProcessor {

//     @Override
//     public boolean process(Set<? extends TypeElement> annotations, RoundEnvironment roundEnv) {
//         for (Element element : roundEnv.getElementsAnnotatedWith(GenerateData.class)) {
//             if (element instanceof TypeElement) {
//                 TypeElement typeElement = (TypeElement) element;
//                 generateGettersAndSetters(typeElement);
//             }
//         }
//         return true;
//     }

//     private void generateGettersAndSetters(TypeElement typeElement) {
//         String className = typeElement.getSimpleName().toString();
//         String packageName = processingEnv.getElementUtils().getPackageOf(typeElement).getQualifiedName().toString();

//         TypeSpec.Builder classBuilder = TypeSpec.classBuilder(className + "Generated")
//                 .addModifiers(Modifier.PUBLIC);

//         for (Element enclosedElement : typeElement.getEnclosedElements()) {
//             if (enclosedElement.getKind().isField()) {
//                 String fieldName = enclosedElement.getSimpleName().toString();
//                 String fieldType = enclosedElement.asType().toString();

//                 // Generate getter
//                 MethodSpec getter = MethodSpec.methodBuilder("get" + capitalize(fieldName))
//                         .addModifiers(Modifier.PUBLIC)
//                         .returns(enclosedElement.asType())
//                         .addStatement("return this.$N", fieldName)
//                         .build();

//                 // Generate setter
//                 MethodSpec setter = MethodSpec.methodBuilder("set" + capitalize(fieldName))
//                         .addModifiers(Modifier.PUBLIC)
//                         .addParameter(enclosedElement.asType(), fieldName)
//                         .addStatement("this.$N = $N", fieldName, fieldName)
//                         .build();

//                 classBuilder.addMethod(getter);
//                 classBuilder.addMethod(setter);
//             }
//         }

//         TypeSpec generatedClass = classBuilder.build();

//         JavaFile javaFile = JavaFile.builder(packageName, generatedClass).build();
//         try {
//             javaFile.writeTo(processingEnv.getFiler());
//         } catch (IOException e) {
//             processingEnv.getMessager().printMessage(Diagnostic.Kind.ERROR, e.toString());
//         }
//     }

//     private String capitalize(String str) {
//         if (str == null || str.isEmpty()) {
//             return str;
//         }
//         return str.substring(0, 1).toUpperCase() + str.substring(1);
//     }
// }


