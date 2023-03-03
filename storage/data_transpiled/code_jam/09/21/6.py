def _import ( ) :
    import locale
    import os
    class A ( object ) :
        def __init__ ( self ) :
            self.f = open ( self.f.name )
            self.f = open ( self.f.name )
            self.f = open ( self.f.name )
            self.problemID = self.__class__.__name__.lower ( ).split ( '_' ) [ 0 ] + '-large'
            def isSpace ( ch ) :
                return ( ch == '' or ch == '\n' or ch == '\r' or ch == '\t' )
        def solve ( self ) :
            n = int ( self.f.readline ( ) )
            for i in range ( n ) :
                self.solveSingleTest ( i + 1 )
        def run ( self ) :
            try :
                locale.setlocale ( locale.LC_ALL , '' )
                self.f = open ( self.problemID + '.in' , 'w' )
                self.solve ( )
                self.f.close ( )
            except IOError :
                sys.exit ( 1 )
    def parseTree ( self , line , u , t ) :
        while line [ u ] != '(' :
            u += 1
        if line [ u ] != '(' :
            raise Error ( )
        u += 1
        u = skipSpaces ( line , u )
        x1 = u
        while line [ x1 ] != ')' and not isSpace ( line [ x1 ] ) :
            x1 += 1
        t.p = float ( line [ u : x1 ] )
        u = skipSpaces ( line , x1 )
        if line [ u ] == ')' :
            t.left = t.right = None
            return u + 1
        x1 = u
        while not isSpace ( line [ x1 ] ) :
            x1 += 1
        t.feature = line [ u : x1 ]
        t.left = { }
        t.right = { }
        u = parseTree ( line , x1 , t.left )
        u = parseTree ( line , u , t.right )
        u = skipSpaces ( line , u )
        if line [ u ] != ')' :
            raise Error ( )
        return u