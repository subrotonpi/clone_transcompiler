def _ import _ , os , sys , stdin , stdout , stderr , t , cur = 0 ) :
    import sys , random
    class C :
        def __init__ ( self ) :
            self.x , self.y = random.randint ( 0 , 10 )
        def __getattr__ ( self , x ) :
            return self.x
        def __getitem__ ( self , y ) :
            return self.y
        def __repr__ ( self ) :
            return '%s/%d done' % ( self.x , self.y )
    class Event ( object ) :
        def __init__ ( self , x , y , type ) :
            self.x , self.y = x , y
            self.side = y or ( y and x ) or - 1
            self.type = type
        def __call__ ( self , f ) :
            with open ( 'C.in','r' ) as f :
                f.readline ( )
        def readline ( self ) :
            while not self.side or not self.side :
                s = None
                try :
                    s = f.readline ( )
                except IOError :
                    pass
                if not s :
                    return s
                s = s.split ( ',' )
            return s
        def __call__ ( self , x , y , type ) :
            if self.side != self.side :
                return int ( self.side )
            vmul = x * 1 * self.y - y * 1 * self.x
            if vmul != 0 :
                return int ( - vmul )
            return int ( self.type )
    def solve ( ) :
        tc = random.randint ( 1 , 10 )
        for t in range ( tc ) :
            print ( 'Case #%d:' % ( t + 1 ) , end = '' )
            n = random.randint ( 1 , 10 )
            a = [ ( x , y ) for x in range ( n ) ]
            res = [ ]
            for mul in range ( - 1 , 2 , 2 ) :
                for i in range ( n ) :
                    events = [ ]
                    cur = 0
                    for j in range ( n ) :
                        if j != i :
                            start = ( mul * ( a [