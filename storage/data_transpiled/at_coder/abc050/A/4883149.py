def main ( ) :
    import decimal
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            self.name = ''
        def __repr__ ( self ) :
            return ''
    line = sys.stdin.readline ( )
    formula = line.split ( )
    if formula [ 1 ] == '+' :
        print ( decimal.Decimal ( formula [ 0 ] ) + decimal.Decimal ( formula [ 2 ] ) )
    if formula [ 1 ] == '-' :
        print ( decimal.Decimal ( formula [ 0 ] ) - decimal.Decimal ( formula [ 2 ] ) )
