def _import ( ) :
    from locale import getlocale
    import locale
    class A_as :
        def __init__ ( self , s , t , w ) :
            self.s = s
            self.t = t
            self.w = w
        def __lt__ ( self , other ) :
            return self.w - other.w
        def solve ( self ) :
            with open ( "A-large.in" , "r" ) as infile :
                with open ( "A-large.out" , "w" ) as outfile :
                    self.test_no = int ( infile.read ( ) )
                for test in range ( 1 , test_no + 1 ) :
                    x , s , r , t , n = select.select ( [ s , t , w ] , [ ] , [ ] )
                    segs = [ ]
                    last = 0
                    for fr , to , w in select.select ( [ s , t , w ] , [ ] , [ ] ) :
                        if fr > last :
                            segs.append ( ( last , fr , 0 ) )
                        segs.append ( ( fr , to , w ) )
                        last = to
                    if last < x :
                        segs.append ( ( last , x , 0 ) )
                    segs.sort ( )
                    ans = 0
                    for seg in segs :
                        seg = segs [ seg ]
                        len = seg.t - seg.s
                        rt = min ( t , len / ( seg.w + r ) )
                        t -= rt
                        ans += rt
                        len -= rt * ( seg.w + r )
                        ans += len / ( seg.w + s )
                    outfile.write ( "Case #%d: %.10f\n" % ( test , ans ) )
    return A_as
