def gcj ( ) :
    import gcj
    import gcj
    import gcj
    import gcj
    import gcj
    import gcj
    import gcj
    import gcj
    import gcj
    class GarbledEmail ( gcj.GarbledEmail ) :
        def __init__ ( self ) :
            self.root = gcj.Node ( )
        def __init__ ( self ) :
            self.children = [ gcj.Node ( ) for i in range ( 26 ) ]
            self.end = False
        def __init__ ( self ) :
            with open ( 'C:/Users/wzzhang/Downloads/garbled_email_dictionary.txt' , 'r' ) as f :
                s = gcj.GarbledEmail ( )
                T = s.readline ( )
                for i in range ( 1 , T + 1 ) :
                    s.write ( s.read ( ) )
        def add ( self , word , idx , cur ) :
            k = word [ idx ] - 'a'
            if not isinstance ( cur.children [ k ] , list ) :
                cur.children [ k ] = [ ]
            if idx + 1 < len ( word ) :
                add ( self , word , idx + 1 , cur.children [ k ] )
            else :
                cur.children [ k ].end = True
    def calc ( self , memo , a , idx , change , cur ) :
        if idx == len ( a ) :
            if cur.end :
                return 0
            else :
                return - 1
        if cur == root :
            if memo [ idx ] [ change ] > - 2 :
                return memo [ idx ] [ change ]
    min = - 1
    if idx >= change :
        for k in range ( len ( cur.children ) ) :
            offset = ( a [ idx ] == k )
            nextchange = ( a [ idx ] == k )
            if cur.children [ k ] != None :
                res = calc ( self , memo , a , idx + 1 , nextchange , cur.children [ k ] )
                if res != - 1 :
                    if min == - 1 :
                        min = res + offset
                    else :
                        min = min
            