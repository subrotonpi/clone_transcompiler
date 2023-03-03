def main ( args ) :
    import sys
    from os.path import expanduser
    with open ( expanduser ( args ) , 'r' ) as f :
        N = int ( f.read ( ) )
        i = 0
        K = 1
        while i < N :
            if is_prime ( 5 * K + 1 ) :
                print ( ( 5 * K + 1 ) , end = ' ' )
                i += 1
            K += 1
    def is_prime ( a ) :
        for i in range ( 2 , a * i + 1 ) :
            if a % i == 0 :
                return False
        return True
    return is_prime
