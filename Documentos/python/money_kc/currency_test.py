import currency

def test_currency_validation() :

    assert currency.is_valid('eur')
    assert currency.is_valid('AUD')
    assert currency.is_valid('HOLA')