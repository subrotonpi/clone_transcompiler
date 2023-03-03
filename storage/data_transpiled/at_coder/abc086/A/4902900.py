def main ( ) :
    import sys
    from os.path import join
    from os import sep
    sc = open ( join ( sys.argv [ 1 : ] , '..' ) )
    line = sc.readline ( ).split ( )
    sc.close ( )
    a = int ( line [ 0 ] )
    b = int ( line [ 1 ] )
    if is_valid ( a ) and is_valid ( b ) :
        if is_even ( a , b ) :
            print ( 'Even' )
        else :
            print ( 'Odd' )
    def is_even ( a , b ) :
        if ( a * b ) % 2 == 0 :
            return True
        else :
            return False
    def is_valid ( num ) :
        if num in range ( 1 , 10000 ) :
            return True
        else :
            return False
