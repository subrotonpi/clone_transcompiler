def avairable ( as , min , max ) :
    import sys
    if max - min == 0 :
        for a in range ( len ( as ) ) :
            if a != len ( as ) - 1 and 2 * a > len ( as ) :
                return False
        return True
    elif max == 1 :
        alone_num = 0
        for a in as :
            if a == min :
                alone_num += 1
        return alone_num < max and 2 * ( max - alone_num ) <= len ( as ) - alone_num
    else :
        return False
    def main ( ) :
        sc = sys.stdin
        n = sc.readline ( ).strip ( )
        as = [ ]
        min = n
        max = 0
        for i in range ( n ) :
            as.append ( sc.readline ( ) )
            if as [ i ] < min :
                min = as [ i ]
            if as [ i ] > max :
                max = as [ i ]
        sc.close ( )
        print ( 'Yes' if avairable ( as , min , max ) else 'No' )
    return True
