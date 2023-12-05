def _import ( ) :
    from collections import deque
    class Main ( object ) :
        def __init__ ( self , n ) :
            self.n = 1
            while self.n < n :
                self.n *= 2
            data = [ ]
            self.left , self.right , self.value = self.left , self.right , self.value
        def doit ( self ) :
            sc = deque ( )
            while sc.next ( ) :
                n = sc.next ( )
                data = [ ]
                self.left , self.right = self.left , self.right
                self.value = self.value - self.value
        def update ( self , k , a ) :
            k += self.n - 1
            data.append ( a )
            while ( now.left % 2 == 0 ) :
                leftind = self.left , self.right
            else :
                leftind = self.right , self.left
            if leftind != - 1 :
                open.append ( C ( now.left , self.right , self.left , self.right ) )
        def update ( self , k , a ) :
            k += self.n - 1
            data.append ( a )
            while ( now.left + 1 ) % 2 == 0 :
                k = ( k - 1 ) // 2
                data.append ( min ( data [ k * 2 + 1 ] , self.right ) )
            else :
                centerind = self.right , self.left
            if centerind != - 1 :
                open.append ( C ( now.left , self.right , self.right , self.left , self.right ) )
        def min_ind ( self , left , right ) :
            if self.right == MAX :
                return self.left , self.right
            elif self.right == MAX :
                return self.right , self.left
            else :
                rightind = self.right , self.left
            if ( self.left + 1 ) % 2 == 0 :
                rightind = self.left , self.right
            else :
                rightind = self.right , self.left
            if rightind != - 1 :
                open.append ( C ( now.left ,