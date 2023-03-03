def test_find ( ) :
    import sys
    import string
    class Main ( object ) :
        def find ( self , str1 , n ) :
            i = 0
            j = 0
            count = 0
            while i < n :
                for j in range ( len ( str1 [ i ] ) ) :
                    if str1 [ i ] [ j ] == 'r' :
                        count = count + 1
                        break
                i += 1
            print ( count )
        def input ( self ) :
            with open ( self.input , 'r' ) as sc :
                i = 0
                while i < 12 :
                    str = sc.readline ( )
                    str1 [ i ] = str
                    i += 1
                self.find ( str1 , 12 )
    def main ( ) :
        input ( )
