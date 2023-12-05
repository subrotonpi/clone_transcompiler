def main ( args ) :
    import sys
    from time import sleep
    with open ( '/proc/sth' , 'r' ) as sc :
        n = int ( sc.read ( ) )
        array = [ 0 ] * ( 12 * 24 + 1 )
        for i in range ( n ) :
            time = sc.read ( ).split ( '-' )
            start = int ( time [ 0 ] )
            start = start // 100 * 60 + start % 100
            start = start - start % 5
            end = int ( time [ 1 ] )
            end = end // 100 * 60 + end % 100
            if end % 5 != 0 :
                end = end + ( 5 - end % 5 )
            array [ start // 5 ] += 1
            array [ end // 5 ] -= 1
        sum = 0
        for i in range ( 12 * 24 + 1 ) :
            sum += array [ i ]
            array [ i ] = sum
        start = - 1
        for i in range ( 12 * 24 + 1 ) :
            if array [ i ] > 0 :
                start = i
                while i < 12 * 24 + 1 and array [ i ] > 0 :
                    i += 1
                end = i
                print ( '%04d' % ( start // 12 * 100 + start % 12 * 5 ) , end = end )
                print ( '-' , end = end )
                print ( '%04d' % ( end // 12 * 100 + end % 12 * 5 ) , end = end )
