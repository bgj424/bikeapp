describe('Test select station on map', () => {
    it('selects station marker on the map', () => {
        cy.visit('http://localhost:3000');
        cy.get('[data-cy="map-container"]')
            .find('.pigeon-click-block > svg > g').first().click({force: true});
        cy.get('[data-cy="current-journey"]').children('span').should('not.contain', 'Click');
        cy.get('[data-cy="map-container"]').find('.pigeon-click-block').should('have.class', 'active');
    })
});