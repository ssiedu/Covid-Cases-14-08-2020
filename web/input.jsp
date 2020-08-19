<html>
    <body>
        <h3>Get-Covid-Details-About-A-Country</h3>
        <h4>Please-Provide-Country-Name</h4>
        <hr>
        <form action="DataProvider" method="get">
            <pre>
            Output-Bkgrnd   pink <input type="radio" name="bgclr" value="pink" checked="check"/> gray <input type="radio" name="bgclr" value="gray"/>
            Your-Name       <input type="text" name="name"/>
            Your-Picture    <input type="file" name="pic"/>
            Country-Name    <select name="country">
                                <option>india</option>
                                <option>usa</option>
                                <option>uk</option>
                            </select>
            
            Donation        mask    <input type="checkbox" name="donation" value="mask"/>
                            ppe     <input type="checkbox" name="donation" value="ppe"/>
                            vaccine <input type="checkbox" name="donation" value="vaccine"/>
            <!--                
            Donation        <select name="donation" multiple="multiple">
                                <option selected="true">mask</option>
                                <option>ppe</option>
                                <option>vaccine</option>
                                <option>medicines</option>
                                <option>ambulence</option>
                            </select>
            -->
                            <input type="submit" value="Get-Data"/>
            </pre>
        </form>
        <hr>
    </body>
</html>
