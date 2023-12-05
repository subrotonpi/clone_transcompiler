def _import ( ) :
    from sys import stdin
    from .input import input
    class Main ( input ) :
        def find ( str1 , n ) :
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
        def input ( ) :
            with stdin :
                i = 0
                while i < 12 :
                    str = stdin.readline ( )
                    str1 = [ str ]
                    i += 1
                return str1
    def find ( str1 , n ) :
        return str1
    return Main ( )
