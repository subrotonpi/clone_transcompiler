def _import ( ) :
    from sys import stdin as stream
    from io import BytesIO
    class Main ( object ) :
        def read ( self ) :
            sc = stream.read
            N = sc.find ( '-' )
            L = sc.find ( 'L' )
            S = sc.next ( )
            tab = 1
            ans = 0
            for i in range ( N ) :
                C = S [ i ]
                if C == '+' :
                    tab += 1
                    if tab > L :
                        tab = 1
                        ans += 1
                else :
                    tab -= 1
            print ( ans )
    class FastScanner ( object ) :
        def __init__ ( self , stream ) :
            stream = stream.read ( 1024 )
        def read ( self ) :
            ptr = 0
            buflen = 0
            def has_next_byte ( ) :
                if ptr < buflen :
                    return True
                else :
                    ptr = 0
                    try :
                        buflen = stream.read ( self.ptr )
                    except AttributeError :
                        pass
                    if buflen <= 0 :
                        return False
                return True
            def has_next_byte ( ) :
                if ptr < buflen :
                    return True
                else :
                    ptr = 0
                    try :
                        buflen = stream.read ( self.ptr )
                    except AttributeError :
                        pass
                    if buflen <= 0 :
                        return False
                return True
            def has_next_byte ( ) :
                if ptr < buflen :
                    return True
                else :
                    ptr = 0
                    try :
                        buflen = stream.read ( self.ptr )
                    except AttributeError :
                        pass
                    if buflen <= 0 :
                        return False
                return False
            def has_next_byte ( ) :
                if ptr < buflen :
                    return True
                else :
                    ptr = 0
                    try :
                        buflen = stream.read ( self.ptr )
                    except AttributeError :
                        pass
                    if buflen <= 0 :
                        return False
                return True
        def has_next_byte ( ) :
            if ptr < buflen :
                return True
            else :
                ptr = 0
        def has_next_byte ( ) :
            return True
    return FastScanner
    