<?php
   $SoapClient = new SoapClient ('http://localhost:10000/conversor?wsdl')
   $params = array('x' => '34', 'y' => '200');
   $result = $ClientSoap => client.celsiustoKelvin ($params);
    print_r($result);
    echo $result -> return;
    
    $result = $ClientSoap => client.kelvintoCelsius ($params);
    print_r($result);
    echo $result -> return;
?>