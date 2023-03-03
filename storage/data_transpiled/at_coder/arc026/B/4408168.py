def main ( ) :
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            self.solve ( )
        def solve ( self ) :
            with open ( '/proc/self/n' ) as sc :
                n = int ( sc.read ( ) )
                sc.close ( )
    def solve ( ) :
        with open ( '/proc/self/n' ) as sc :
            n = int ( sc.read ( ) )
            sc.close ( )
        num = 1
        for i in range ( 2 , math.sqrt ( n ) + 1 ) :
            if n % i == 0 :
                if i == math.sqrt ( n ) :
                    num += i
                else :
                    num += i + n / i
        print ( 'Deficient' if n == 1 else num == n and 'Perfect' if num > n else 'Abundant' )
