def main ( ) :
    class Main ( object ) :
        _sc = sys._getframe ( 1 )
        O = _sc.read ( )
        E = _sc.read ( )
        if O.shape [ 0 ] >= len ( E ) :
            n = len ( E )
        else :
            n = len ( O )
        OArray = O.split ( '' )
        EArray = E.split ( '' )
        answer = ''
        for i in range ( n * 2 ) :
            if i % 2 == 0 :
                answer += OArray [ i // 2 ]
            else :
                answer += EArray [ i // 2 ]
        if O.shape [ 0 ] >= len ( E ) :
            for i in range ( n , len ( O ) ) :
                answer += OArray [ i ]
        else :
            for i in range ( n , len ( E ) ) :
                answer += EArray [ i ]
        return answer
    def print_array ( what ) :
        if what is None :
            print ( 'None' )
        else :
            print ( what )
    def print_array ( what ) :
        if what is None :
            print ( 'None' )
        else :
            print ( what )
    def print_array ( what ) :
        if what is None :
            print ( 'None' )
        else :
            print ( what )
    def print_array ( what ) :
        print ( what )
    def print_array ( what ) :
        print ( what )
    def print_array ( what ) :
        print ( what )
    def print_array ( what ) :
        print ( what )
    def print_array ( what ) :
        print ( what )
    def print_array ( what ) :
        print ( what )
    def print_array ( what ) :
        print ( what )
