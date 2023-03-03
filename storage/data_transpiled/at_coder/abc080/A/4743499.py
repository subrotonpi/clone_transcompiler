def main ( ) :
    import re
    from sys import argv
    sc = open ( argv [ 1 ] )
    input = sc.read ( )
    x = re.split ( '[ ]+' , input )
    n = int ( x [ 0 ] )
    a = int ( x [ 1 ] )
    b = int ( x [ 2 ] )
    if n * a <= b :
        print ( n * a )
    else :
        print ( b )
    sc.close ( )
