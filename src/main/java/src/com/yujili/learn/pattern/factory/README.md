# Factory Pattern

## Problem

Independent deployable application can create object, that they use without depending on those object. 


## Solution

Introduce Factory pattern

## Consideration

### Boundary Dilemma

New shape must introduce one make, but we can use `getType(String typeName)` to solve this issue.

Though this solution may break type safe because

- Type safe reply on coupling
- Independent deploy ability tru tp de-couple objects

The TDD is able to help to solve type safe issue during development.
