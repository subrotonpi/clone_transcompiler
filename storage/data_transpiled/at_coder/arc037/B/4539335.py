def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.sys = sys
    def __call__ ( self ) :
        sc = Scanner ( )
        ( N , M ) = sc.next ( )
        graph = [ [ False ] * ( N + 1 ) ]
        visited = [ 0 ] * ( N + 1 )
        tree = [ ]
        for u , v in sc.next ( ) :
            graph [ u ] [ v ] = True
            graph [ v ] [ u ] = True
        for i in range ( 1 , N + 1 ) :
            if visited [ i ] == 0 :
                tree.append ( dfs ( i , i , 0 , graph , visited ) )
        cnt = 0
        for b in tree :
            if b :
                cnt += 1
        print ( cnt )
        sc.close ( )
    def dfs ( self , node , root , from_node , graph , visited ) :
        flag = True
        if visited [ node ] != 0 :
            flag = False
            return flag
        visited [ node ] = root
        for i in range ( 1 , len ( graph [ node ] ) ) :
            if i != from_node and graph [ node ] [ i ] :
                flag = dfs ( i , root , node , graph , visited ) and flag
        return flag
