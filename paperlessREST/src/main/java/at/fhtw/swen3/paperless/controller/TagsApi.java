/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (7.1.0-SNAPSHOT).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package at.fhtw.swen3.paperless.controller;

import at.fhtw.swen3.paperless.services.dto.CreateTag200Response;
import at.fhtw.swen3.paperless.services.dto.CreateTagRequest;
import at.fhtw.swen3.paperless.services.dto.GetTags200Response;
import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.Parameters;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import io.swagger.v3.oas.annotations.tags.Tag;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.multipart.MultipartFile;

import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import jakarta.annotation.Generated;

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-11-03T13:46:03.125613Z[Etc/UTC]")
@Validated
@Controller
@Tag(name = "Tags", description = "the Tags API")
public interface TagsApi {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * POST /api/tags/
     *
     * @param createTagRequest  (optional)
     * @return Success (status code 200)
     */
    @Operation(
        operationId = "createTag",
        tags = { "Tags" },
        responses = {
            @ApiResponse(responseCode = "200", description = "Success", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = CreateTag200Response.class))
            })
        }
    )
    @RequestMapping(
        method = RequestMethod.POST,
        value = "/api/tags/",
        produces = { "application/json" },
        consumes = { "application/json" }
    )
    
    default ResponseEntity<CreateTag200Response> createTag(
        @Parameter(name = "CreateTagRequest", description = "") @Valid @RequestBody(required = false) CreateTagRequest createTagRequest
    ) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"owner\" : 1, \"matching_algorithm\" : 6, \"user_can_change\" : true, \"color\" : \"color\", \"is_insensitive\" : true, \"name\" : \"name\", \"match\" : \"match\", \"id\" : 0, \"text_color\" : \"text_color\", \"is_inbox_tag\" : true, \"slug\" : \"slug\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.OK);

    }


    /**
     * GET /api/tags/
     *
     * @param page  (optional)
     * @param fullPerms  (optional)
     * @return Success (status code 200)
     */
    @Operation(
        operationId = "getTags",
        tags = { "Tags" },
        responses = {
            @ApiResponse(responseCode = "200", description = "Success", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = GetTags200Response.class))
            })
        }
    )
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/api/tags/",
        produces = { "application/json" }
    )
    
    default ResponseEntity<GetTags200Response> getTags(
        @Parameter(name = "page", description = "", in = ParameterIn.QUERY) @Valid @RequestParam(value = "page", required = false) Integer page,
        @Parameter(name = "full_perms", description = "", in = ParameterIn.QUERY) @Valid @RequestParam(value = "full_perms", required = false) Boolean fullPerms
    ) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"next\" : 6, \"all\" : [ 5, 5 ], \"previous\" : 1, \"count\" : 0, \"results\" : [ { \"owner\" : 9, \"matching_algorithm\" : 2, \"document_count\" : 7, \"color\" : \"color\", \"is_insensitive\" : true, \"permissions\" : { \"view\" : { \"groups\" : [ \"\", \"\" ], \"users\" : [ \"\", \"\" ] }, \"change\" : { \"groups\" : [ \"\", \"\" ], \"users\" : [ \"\", \"\" ] } }, \"name\" : \"name\", \"match\" : \"match\", \"id\" : 5, \"text_color\" : \"text_color\", \"is_inbox_tag\" : true, \"slug\" : \"slug\" }, { \"owner\" : 9, \"matching_algorithm\" : 2, \"document_count\" : 7, \"color\" : \"color\", \"is_insensitive\" : true, \"permissions\" : { \"view\" : { \"groups\" : [ \"\", \"\" ], \"users\" : [ \"\", \"\" ] }, \"change\" : { \"groups\" : [ \"\", \"\" ], \"users\" : [ \"\", \"\" ] } }, \"name\" : \"name\", \"match\" : \"match\", \"id\" : 5, \"text_color\" : \"text_color\", \"is_inbox_tag\" : true, \"slug\" : \"slug\" } ] }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.OK);

    }

}
