package stepdef;



import static org.testng.Assert.assertTrue;

import context.TestContext;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageclasses.SearchPage;

public class SearchSteps {
	
	private TestContext context;
    private SearchPage searchPage;

    public SearchSteps(TestContext context) {
        this.context = context;
        this.searchPage = this.context.getPageClassManager().getSearchPage();
    }

    // Step for searching a product
    @When("I search for {string}")
    public void i_search_for(String product) {
        context.log("Searching for product: " + product);
        searchPage.enterProductName(product);   // type in search box
        searchPage.clickSearchButton();       // click search
    }

    // Step for verifying existing product results
    @Then("I should see product results related to {string}")
    public void i_should_see_product_results_related_to(String product) {
        context.log("Verifying search results for: " + product);
        assertTrue(searchPage.isProductInResults(product));
    }

    // Step for verifying no results message
    @Then("I should see a message that no products were found")
    public void i_should_see_a_message_that_no_products_were_found() {
        context.log("Verifying 'no products found' message is displayed");
        assertTrue(searchPage.isNoResultsMessageDisplayed());
    }

}
