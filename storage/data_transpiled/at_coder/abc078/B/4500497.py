def main ( ) :
    import sys
    from time import sleep
    from math import sqrt
    from math import sin , cos , cos , log
    from os import environ
    length = int ( environ.get ( 'LENGTH' , 0 ) )
    width = int ( environ.get ( 'WIDTH' , 0 ) )
    space = int ( environ.get ( 'SPACE' , 0 ) )
    ans = 0
    ans = ( length - space ) / ( width + space )
    print ( ans )
