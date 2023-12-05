def main ( ) :
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            self.name = "Main"
        def __call__ ( self , * args ) :
            line = self.name.split ( ) [ 0 ].split ( )
            self.child_per = int ( line [ 0 ] )
            self.adult_per = int ( line [ 1 ] )
            self.k_deduct = int ( line [ 2 ] )
            self.k = int ( line [ 3 ] )
            line = self.name.split ( ) [ 0 ].split ( )
            self.n_child = int ( line [ 0 ] )
            self.n_adult = int ( line [ 1 ] )
            self.sum = 0
            if self.n_child + self.n_adult >= self.k :
                self.sum += ( self.child_per - self.k_deduct ) * self.n_child
                self.sum += ( self.adult_per - self.k_deduct ) * self.n_adult
            else :
                self.sum += self.child_per * self.n_child
                self.sum += self.adult_per * self.n_adult
            print ( self.sum )
