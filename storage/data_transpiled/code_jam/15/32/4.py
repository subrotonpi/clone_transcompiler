def round1c ( ) :
    import os
    import sys
    import os
    import sys
    import os
    import sys
    class B ( object ) :
        def __init__ ( self ) :
            self.io = Kattio ( open ( 'round1c/B-large.in' , 'rb' ) , open ( 'round1c/B-large-0.out' , 'wb' ) )
            self.cases = self.io.get_int ( )
            for i in range ( len ( self.keyboard ) ) :
                c = self.keyboard [ i ]
                newPos = self.pos2
                if self.target [ pos2 ] == c :
                    newPos = self.findPos ( self.target [ : newPos ] + c )
                self.sum += e + go ( self.lettersLeft , newPos )
            self.memo [ self.lettersLeft , self.pos ] = exp
            return exp
        def solve ( self , io ) :
            self.keyboard , self.target = io.get_int ( ) , io.get_int ( )
            self.pos = self.pos
            self.memo [ self.lettersLeft , self.pos ] = exp
            return exp
        def solve ( self , io ) :
            self.K , self.L , self.S = io.get_int ( ) , io.get_int ( )
            self.keyboard , self.target = io.word
            next = - 1
            for i in range ( len ( self.target ) ) :
                if self.target.startswith ( self.target [ i + 1 ] ) :
                    next = i + 1
                    break
            max , pos = 0 , 0
            while pos + len ( self.target ) <= S :
                max += 1
                pos += next
            for c in self.target :
                if not self.keyboard [ c ] in self.memo :
                    max = 0
            if max == 0 :
                io.write ( max )
                return
            self.findPosCache = { }
            self.memoDone = { }
            self.memo = { }
            self.findPosCache [ self.lettersLeft , self.pos ] = res
            return res
    return B ( )
