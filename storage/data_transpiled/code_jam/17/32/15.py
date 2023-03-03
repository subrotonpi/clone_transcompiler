def round1c ( ) :
    import _bisect
    import _bisect
    import _bisect
    import _bisect
    import _bisect
    class ProbBB ( _bisect ) :
        def setup ( self ) :
            self.bin = True
            self.bout = True
            self.inp = "B-large.inp"
            self.out = None
            self.totv = 0
            self.bout = None
            self.tot = _bisect.bisect_left ( self.tot , self.bout )
            self.bout = _bisect.bisect_right ( self.tot , self.bout )
            self.bout = _bisect.bisect_right ( self.tot , self.bout )
            self.bout = _bisect.bisect_right ( self.tot , self.bout )
            self.run ( )
            self.redirect ( )
            T = self.scanner.randint ( )
            for cas in range ( 1 , T + 1 ) :
                ans = self.run ( )
                print ( 'Case #%d: %d' % ( cas , ans ) )
        def run ( self ) :
            ac = self.scanner.randint ( )
            aj = self.scanner.randint ( )
            all = [ [ ] for _ in range ( ac + aj ) ]
            n = ac + aj
            cc = 0
            for _ in range ( ac ) :
                start = self.scanner.randint ( )
                end = self.scanner.randint ( )
                all [ cc ].append ( start )
                all [ cc ].append ( end )
                all [ cc ].append ( 1 )
                cc += 1
            for _ in range ( aj ) :
                start = self.scanner.randint ( )
                end = self.scanner.randint ( )
                all [ cc ].append ( start )
                all [ cc ].append ( end )
                all [ cc ].append ( 2 )
                cc += 1
            for _ in range ( aj ) :
                start = self.scanner.randint ( )
                end = self.scanner.randint ( )
                all [ cc ].append ( start )
                all [ cc ].append ( end )
                all [ cc ].append ( 1 )
                cc += 1
        self.ablk = [ ]
    