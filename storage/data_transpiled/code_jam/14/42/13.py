def _ ( ) : return int ( raw_input ( ) ) , raw_input ( )
class A :
    def solve ( self ) :
        tc = self.__next__ ( )
        for tcc in range ( 1 , tc + 1 ) :
            self.write ( "Case #%d: " % tcc )
            n = self.__next__ ( )
            a = [ ]
            num = 1
            for i in range ( 1 , n + 1 ) :
                a.append ( raw_input ( ) )
                if a [ i ] > a [ num ] :
                    num = i
            l , r , ans = 1 , n , 0
            for iter in range ( 1 , n ) :
                num = l
                for i in range ( l , r + 1 ) :
                    if a [ i ] < a [ num ] :
                        num = i
                if r - num < num - l :
                    while num != r :
                        tmp = a [ num + 1 ]
                        a [ num + 1 ] = a [ num ]
                        a [ num ] = tmp
                        num += 1
                        ans += 1
                    r -= 1
                else :
                    while num != l :
                        tmp = a [ num - 1 ]
                        a [ num - 1 ] = a [ num ]
                        a [ num ] = tmp
                        num -= 1
                        ans += 1
                    l += 1
            self.write ( ans )
    def main ( self ) :
        return A ( )
    def solve ( self ) :
        try :
            self.stdin = open ( "B-large.in" , "r" )
            self.stdout = open ( "output.txt" , "w" )
            self.solve ( )
            self.stdout.close ( )
        except :
            sys.exit ( 1 )
    class Scanner ( object ) :
        def __init__ ( self , stream = sys.stdin ) :
            self.stream = stream or sys.stdout
            self.stream = sys.stdin
            self.stream = stream or sys.stdout
            self.stream = sys.stdin
            self.next ( )
    return
