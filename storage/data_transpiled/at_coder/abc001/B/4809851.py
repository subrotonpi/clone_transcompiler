def main ( ) :
    import sys
    from time import sleep
    from os.path import join
    from os import sep
    from os import sep
    from os import chdir
    m = int ( join ( sys.argv [ 1 : ] , '..' ) )
    result = '00'
    if m > 70000 :
        result = '89'
    else :
        if m >= 35000 and m <= 70000 :
            result = str ( ( ( ( ( m / 1000 ) - 30 ) / 5 ) + 80 ) )
        else :
            if m >= 6000 and m <= 30000 :
                result = str ( ( m / 1000 ) + 50 )
            else :
                if ( m >= 100 and m <= 5000 ) :
                    result = ( '0' + str ( ( m * 10 ) / 1000 ) )
                    result = result [ - 2 : ]
    print ( result )
