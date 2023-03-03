def import import decimal , decimals , string
import sys
class Main ( object ) :
    def __init__ ( self , parser ) :
        self.parser = parser
        self.args = parser
        self.number1 = decimal.Decimal ( string.strip ( self.args [ 0 ] ) )
        self.number2 = decimal.Decimal ( string.strip ( self.args [ 1 ] ) )
        print ( number1 / number2 )
