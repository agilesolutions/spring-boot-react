const Carlist = require("./Carlist")

// @ponicode
describe("componentDidMount", () => {
    let object
    let inst

    beforeEach(() => {
        object = [["Pierre Edouard", "George", "Jean-Philippe"], ["Edmond", "Pierre Edouard", "Michael"], ["Pierre Edouard", "George", "Michael"]]
        inst = new Carlist.default(object)
    })

    test("0", () => {
        let callFunction = () => {
            inst.componentDidMount()
        }
    
        expect(callFunction).not.toThrow()
    })
})

// @ponicode
describe("addCar", () => {
    let object
    let inst

    beforeEach(() => {
        object = [["Pierre Edouard", "George", "Michael"], ["Pierre Edouard", "George", "Michael"], ["Edmond", "Jean-Philippe", "Anas"]]
        inst = new Carlist.default(object)
    })

    test("0", () => {
        let callFunction = () => {
            inst.addCar("a1969970175")
        }
    
        expect(callFunction).not.toThrow()
    })

    test("1", () => {
        let callFunction = () => {
            inst.addCar(12)
        }
    
        expect(callFunction).not.toThrow()
    })

    test("2", () => {
        let callFunction = () => {
            inst.addCar(12345)
        }
    
        expect(callFunction).not.toThrow()
    })

    test("3", () => {
        let callFunction = () => {
            inst.addCar(987650)
        }
    
        expect(callFunction).not.toThrow()
    })

    test("4", () => {
        let callFunction = () => {
            inst.addCar("bc23a9d531064583ace8f67dad60f6bb")
        }
    
        expect(callFunction).not.toThrow()
    })

    test("5", () => {
        let callFunction = () => {
            inst.addCar(-Infinity)
        }
    
        expect(callFunction).not.toThrow()
    })
})

// @ponicode
describe("updateCar", () => {
    let object
    let inst

    beforeEach(() => {
        object = [["Michael", "Pierre Edouard", "George"], ["Edmond", "Pierre Edouard", "Michael"], ["George", "Pierre Edouard", "Anas"]]
        inst = new Carlist.default(object)
    })

    test("0", () => {
        let callFunction = () => {
            inst.updateCar(987650, "www.google.com")
        }
    
        expect(callFunction).not.toThrow()
    })

    test("1", () => {
        let callFunction = () => {
            inst.updateCar(12345, "https://croplands.org/app/a/reset?token=")
        }
    
        expect(callFunction).not.toThrow()
    })

    test("2", () => {
        let callFunction = () => {
            inst.updateCar(987650, "Www.GooGle.com")
        }
    
        expect(callFunction).not.toThrow()
    })

    test("3", () => {
        let callFunction = () => {
            inst.updateCar(12345, "https://accounts.google.com/o/oauth2/revoke?token=%s")
        }
    
        expect(callFunction).not.toThrow()
    })

    test("4", () => {
        let callFunction = () => {
            inst.updateCar(12, "https://twitter.com/path?abc")
        }
    
        expect(callFunction).not.toThrow()
    })

    test("5", () => {
        let callFunction = () => {
            inst.updateCar(undefined, undefined)
        }
    
        expect(callFunction).not.toThrow()
    })
})
