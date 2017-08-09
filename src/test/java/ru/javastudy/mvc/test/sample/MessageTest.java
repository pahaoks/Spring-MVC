package ru.javastudy.mvc.test.sample;

/**
 * Created for JavaStudy.ru on 04.03.2016.
 */
//@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration(classes={WebAppinitializer.class})
public class MessageTest {

//Comment  this 'bean class="org.springframework.web.servlet.view.XmlViewResolver" ' in mvc-context.xml
//to avoid 'Caused by: java.lang.IllegalStateException:WebApplicationObjectSupport instance [org.springframework.web.servlet.view.XmlViewResolve'

  /*  @Autowired
    private ApplicationContext applicationContext;

    @Test
    public void messageTest() {
        SampleBean sampleBean = applicationContext.getBean("sampleBean", SampleBean.class);
        Assert.assertNotNull(sampleBean);

        sampleBean = (SampleBean) applicationContext.getBean("sampleBean");
        Assert.assertNotNull(sampleBean);

        Assert.assertEquals(sampleBean.getNumber(), 666);
        Assert.assertEquals(sampleBean.getStringValue(), "postConstructValue");

        System.out.println(applicationContext.getMessage("navMenu.home", null, new Locale("en")));
    }*/
}

