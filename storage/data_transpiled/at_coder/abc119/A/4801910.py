def main ( ) :
    import sys
    from os import path
    from os import environ
    S = environ [ 'S' ]
    ans = int ( S.replace ( '/' , '' ) )
    if ans <= 20190430 :
        print ( 'Heisei' )
    else :
        print ( 'TBD' )
