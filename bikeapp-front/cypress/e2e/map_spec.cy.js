describe('Test select station on map', () => {
    it('hovers and selects station marker on the map', () => {
        cy.visit('http://localhost:3000');
        cy.get('[data-cy="map-container"]')
            .find('.pigeon-click-block > svg > g').first().then($marker => {
                cy.wrap($marker).trigger('mouseover', {force: true})
                cy.get('[data-cy="map-container"]').find('.pigeon-click-block > div').should('be.visible');
                cy.wrap($marker).click({force: true});
            });
        cy.get('[data-cy="current-journey"]').children('span').should('not.contain', 'Click');
        cy.get('[data-cy="map-container"]').find('.pigeon-click-block').should('have.class', 'active');
    })
});