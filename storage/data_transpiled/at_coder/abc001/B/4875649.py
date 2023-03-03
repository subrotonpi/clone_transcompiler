def main ( ) :
    import sys
    from time import sleep
    from random import randint
    from sys import stdin
    value = stdin.read ( )
    if value < 100 :
        print ( '00' )
    elif 100 <= value <= 5000 :
        print ( adjust_value ( value / 100 ) )
    elif 6000 <= value <= 30000 :
        print ( value / 1000 + 50 )
    elif 35000 <= value <= 70000 :
        print ( ( value / 1000 - 30 ) / 5 + 80 )
    else :
        print ( 89 )
    def adjust_value ( value ) :
        if 10 > value :
            return '0' + str ( value )
        else :
            return '{}'.format ( value )
    return adjust_value ( value )
