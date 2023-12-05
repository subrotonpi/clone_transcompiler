def main ( ) :
    import sys
    from numpy.linalg import norm
    with open ( '../data/data/' + str ( sys.argv [ 1 ] ) , 'r' ) as sc :
        s = sc.read ( ).split ( )
        N , M = int ( s [ 0 ] ) , int ( s [ 1 ] )
        list1 = [ norm ( x ) for x in sc.read ( ).split ( ) ]
        list1.sort ( reverse = True )
        list2 = norm ( list1 )
        list2.sort ( reverse = True )
        rate = 0.0
        for x in list2 :
            rate = ( rate + x ) / 2
        print ( rate )
