def _ import _ , file = sys.stdout ) : return file
class Main ( object ) :
    def __init__ ( self ) :
        file = file
        sc = file.read ( )
        task = Task ( )
        task.solve ( sc , file )
        file.flush ( )
        sc.close ( )
    def get_stringlist ( sc , size ) :
        stringlist = [ ]
        for i in range ( size ) :
            stringlist.append ( nlong ( sc ) )
        return stringlist
    def lcm ( a , b ) :
        return a * b / gcd ( b , a % b )
    def gcd ( a , b ) :
        return a if b == 0 else gcd ( b , a % b )
    def nint ( sc ) :
        return int ( sc )
    def nlong ( sc ) :
        return long ( sc )
    def ndouble ( sc ) :
        return float ( sc )
    def nfloat ( sc ) :
        return float ( sc )
    def nstr ( sc ) :
        return str ( sc )
    def long_line ( sc , size ) :
        l_line = [ ]
        for i in range ( size ) :
            l_line.append ( nlong ( sc ) )
        return l_line
    def int_line ( sc , size ) :
        i_line = [ ]
        for i in range ( size ) :
            i_line.append ( nint ( sc ) )
        return i_line
    def strLine ( sc , size ) :
        strLine = [ ]
        for i in range ( size ) :
            strLine.append ( nstr ( sc ) )
        return strLine
    def max_from_list ( long_list ) :
        return long_list.max ( key = lambda x : x [ 0 ] )
    def min_from_list ( long_list ) :
        return long_list.min ( key = lambda x : x [ 0 ] )
    def sum_digits ( sum_digits ) :
        n = 0
        while n != 0 :
            n += 1
            n //= 10
        return sum_digits
    def sum_digits ( sum_digits ) :
        n = 0
        while n != 0 :
            n /= 10
        return sum_digits
