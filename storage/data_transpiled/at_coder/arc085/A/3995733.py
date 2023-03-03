def main ( ) :
    import sys
    try :
        with open ( '/proc/net/dev/tty' , 'r' ) as sc :
            eval ( sc )
    except :
        print ( 'No such file or directory' )
        return
    def solve ( sc ) :
        n , m = sc.read ( ).split ( ' ' )
        print ( ( 1900 * m + 100 * ( n - m ) ) * int ( math.pow ( 2 , m ) ) )
    return solve
