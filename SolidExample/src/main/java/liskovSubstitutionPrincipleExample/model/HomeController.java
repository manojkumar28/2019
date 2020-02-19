package liskovSubstitutionPrincipleExample.model;

@Controller
public class HomeController {
     
    private final Logger LOGGER = LoggerFactory.getLogger(this.getClass());
 
    @RequestMapping(value = "/books/{isbn}", method = RequestMethod.GET)
    public String getBook(@PathVariable Isbn isbn, Map<String, Object> model) 
    {
        LOGGER.info("You searched for book with ISBN :: " + isbn.getIsbn());
        model.put("isbn", isbn);
        return "index";
    }
     
    @InitBinder
    public void initBinder(WebDataBinder binder) {
      binder.registerCustomEditor(Isbn.class, new IsbnEditor());
    }
}
